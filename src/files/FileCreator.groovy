package files

class FileCreator {

    static File getUpdatesDir() {

        def dirName = System.getenv('APPDATA')
        if (!dirName)
            return new File("~/.unibos/branch-app/unibos-updater")

        dirName -= 'Roaming'
        dirName -= 'Local'
        dirName -= 'LocalLow'
        if (dirName.endsWith('\\'))
            dirName = dirName.substring(0, dirName.length() - 1)

        def dir = new File("${dirName}/Local/unibos-updater")


        return dir
    }

    static void createInstallMonitorFile(updatesDir) {

        def okToCont = true
        String latestVersion = null
        def pendingDir = new File(updatesDir, 'pending')
        for (File it in pendingDir.listFiles()) {

            if (it.name.startsWith('temp-'))
                continue

            if (!latestVersion && it.name.endsWith('.exe')) {
                latestVersion = it.name
            }
            if (it.isFile() && it.length() == 0)
                okToCont = false
        }

        if (!latestVersion?.length())
            return

        if (okToCont) {
            def installFileLocation = updatesDir.toString() + "\\" + latestVersion
            installFileLocation = installFileLocation.toString().replace("\\", "\\\\")

            // create JSON content manually
            StringBuilder sb = new StringBuilder("{\"fileLocation\":\"")
            sb.append(installFileLocation)
                    .append("\",\"username\":\"")
                    .append(System.getenv('USERNAME'))
                    .append("\"}")

            // ensure monitoring directory is created
            String loc = "C:\\ProgramData\\Unibos\\post_install"
            def dir = new File(loc)
            if (!dir.exists()) {
                dir.mkdir()
            }

            // create the file
            def monitorFile = new File(loc + "\\install.json").text = sb.toString()
        }
    }
}
