import com.google.i18n.phonenumbers.NumberParseException
import com.google.i18n.phonenumbers.PhoneNumberUtil
import files.FileCreator

import java.nio.file.Path
import java.security.MessageDigest
import java.time.LocalDate
import java.time.LocalDateTime

import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

//Developer d = new Developer();
//d.firstName = "Fouche"
//d.setLastName("du Preez")
//d.languages << "Groovy"
//d.languages << "Java"
//
//d.work()

//int totalScore = 0
//int bankScore = ScoreCalculator.bankScore('CAPITEC')
//totalScore += bankScore
//println('bankScore:' + bankScore)
//
//int bureauScore = ScoreCalculator.bureauScore(620)
//totalScore += bureauScore
//println('bureauScore:' + bureauScore)
//
//int unsScore = ScoreCalculator.unsPercPayments1YearScore(620)
//println('unsScore:' + unsScore)
//totalScore += unsScore
//
//println('total score:' + totalScore)

//BigDecimal num = 1090.00
//int rounded = 0
//
//if (num > 0)
//    rounded = (int) ((Math.floor(num / 100.0)) * 100)
//
//def round50up = { int x ->
//    x + (50 - (x % 50 ?: 50))
//}
//
//println round50up((int) 250.25)
//println round50up(265)
//println round50up(300)
//println round50up(301)
//println round50up(351)

//dir = FileCreator.getUpdatesDir()
//println(dir)
//FileCreator.createInstallMonitorFile(dir)


//String latestVersion = "setup-6.1.45-beta.exe"
//def folderLocation = latestVersion.substring(6, latestVersion.length()-4)
//def loc = "zm"
//println("C:\\\\UnibosInstalls\\\\${loc}\\\\${folderLocation}\\\\${latestVersion}")

//String recordingFile = 'out-0680401632-10005-20240503-080736-1714723656.234.wav'
//
//String[] fileParts = recordingFile.split('-')
//String datePart = fileParts[3]
//
//StringBuilder sb = new StringBuilder()
//sb.append('some server')
//        .append('/RECORDINGS/')
//        .append(datePart.substring(0,4))
//        .append('/')
//        .append(datePart.substring(4,6))
//        .append('/')
//        .append(datePart.substring(6,8))
//        .append('/')
//        .append(recordingFile)
//
//println sb.toString()

//println UUID.randomUUID().toString().substring(0, 16)

//LocalDate now = LocalDate.now()
//println  LocalDateTime.now().format("YYYY-MM-dd  HH:mm")

//String from = "27828565009"
//println from.length()
//from = "0" + from.substring(2,11)
//println from


//String businessRole = "CREDIT_DEBTOR:Client:creditDebtor:20231196732b94fe64611edbfd62ac13abd019f"
//String debtorId = ""
//if (businessRole.length() > 0) {
//    String[] businessRoles = businessRole.split(":")
//    for (int i = 0; i < businessRoles.length; i++) {
//        if (businessRoles[i] == "creditDebtor") {
//            debtorId = businessRoles[i+1]
//            break
//        }
//    }
//}
//
//println(debtorId)


//String response = """
//{"result":{"Response":"Success","Message":"Command output follows","data":"Privilege: Command-- General --Name:PJSIP\\/10001-000002f0 Type: PJSIP UniqueID: 1717164674.1426 LinkedID: 1717164672.1423 Caller ID: 10001 Caller IDName: 10001 Connected Line ID: 27211110888 Connected Line ID Name: 27211110888 Eff. Connected Line ID:27211110888 Eff.
//"""
//
////String response = """
////{"result":{"Response":"Error","Message":"Command output follows","data":"       Shows lots of information about the specified channel."}}
////"""
//
//String asteriskId = "Not found"
//int startIdx = response.indexOf("LinkedID:")
//if (startIdx != -1) {
//    asteriskId = response.substring(startIdx+10, startIdx+25)
//}
//
//println(asteriskId)

//Map<String,List<String>> queryParameters = ["taskId":["1234"]]
//
//parameters = [:]
//
//if (parameters.size() == 0) {
//    queryParameters.each {
//        parameters[it.key] = it.value[0]
////    println it.key
////    println queryParameters[it.key][0]
//    }
//}
//
//println(parameters)

//println(queryParameters["taskId"][0])

//String rsp = "{\"result\":{\"Response\":\"Success\",\"Message\":\"Command output follows\",\"data\":\"Privilege: Command\\n-- General --\\nName: PJSIP\\/10002-00000674\\nType: PJSIP\\nUniqueID: 1720000004.2248\\nLinkedID: 1720000001.2247\\nCaller ID: 10002\\nCaller ID Name: 10002\\nConnected Line ID: 27211110888\\nConnected Line ID Name: 27211110888\\nEff. Connected Line ID: 27211110888\\nEff. Connected Line ID Name: 27211110888\\nDNID Digits: (N\\/A)\\nLanguage: en_GB\\nState: Up (6)\\nNativeFormats: (ulaw)\\nWriteFormat: slin\\nReadFormat: slin\\nWriteTranscode: Yes (slin@8000)->(ulaw@8000)\\nReadTranscode: Yes (ulaw@8000)->(slin@8000)\\nTime to Hangup: 0\\nElapsed Time: 0h0m20s\\nBridge ID: 53908004-54cd-4aec-bd31-c9ac3f82bf41\\n--   PBX   --\\nContext: unifi-to-trunk\\nExtension: 10503\\nPriority: 1\\nCall Group: 0\\nPickup Group: 0\\nApplication: AppQueue\\nData: (Outgoing Line)\\nCall Identifer: [C-00000287]\\nVariables:\\nBRIDGEPVTCALLID=4a09a4896e6b8bf04cea3d9a137d0222@169.255.240.155:5160\\nBRIDGEPEER=PJSIP\\/WebRTC_Test-00000673\\nDIALEDPEERNUMBER=10002\\nQC_CONFIRM=0\\nSIGNORE=TRUE\\nRVOL_MODE=dontcare\\nQCONTEXT=0\\nNODEST=10503\\nDIAL_OPTIONS=HhTtrM(auto-blkvm)\\nBLKVM_CHANNEL=PJSIP\\/WebRTC_Test-00000673\\nTTL=64\\nCALLEE_ACCOUNCODE=\\nivrreturn=0\\nIVR_RETVM=\\nIVR_CONTEXT=ivr-1\\nIVR_CONTEXT_ivr-1=\\nCRM_LINKEDID=1720000001.2247\\nCRM_SOURCE=27211110888\\nCRM_DIRECTION=INBOUND\\nCALLINGNUMPRES_SV=allowed_not_screened\\nCALLINGNAMEPRES_SV=allowed_not_screened\\nREVERSAL_REJECT=FALSE\\nMOHCLASS=\\nFROM_DID=27874742660\\nREC_STATUS=RECORDING\\nRECORD_ID=PJSIP\\/WebRTC_Test-00000673\\nMIXMON_ID=0x7f83e07257a0\\nCALLFILENAME=in-27874742660-27211110888-20240703-094641-1720000001.2247\\nREC_POLICY_MODE=FORCE\\nMON_FMT=ogg\\nTIMESTR=20240703-094641\\nYEAR=2024\\nMONTH=07\\nDAY=03\\nDIRECTION=INBOUND\\nCDR Variables:\\nlevel 1: clid=\\\"10002\\\" <10002>\\nlevel 1: src=10002\\nlevel 1: dst=10503\\nlevel 1: dcontext=unifi-to-trunk\\nlevel 1: channel=PJSIP\\/10002-00000674\\nlevel 1: lastapp=AppQueue\\nlevel 1: lastdata=(Outgoing Line)\\nlevel 1: start=1720000004.589867\\nlevel 1: answer=1720000007.584652\\nlevel 1: end=1720000007.588168\\nlevel 1: duration=2\\nlevel 1: billsec=0\\nlevel 1: disposition=8\\nlevel 1: amaflags=3\\nlevel 1: uniqueid=1720000004.2248\\nlevel 1: linkedid=1720000001.2247\\nlevel 1: sequence=2977\\n\\n-- Streams --\\nName: audio-0\\nType: audio\\nState: sendrecv\\nGroup: 0\\nFormats: (ulaw|alaw|g722)\\nMetadata:\\n\"}}"
//int startIdx = rsp.indexOf("Name: PJSIP")
//response = rsp.substring(startIdx+6, startIdx+27).replaceAll("\\\\", "")
//println response

//LocalDateTime now = LocalDateTime.now()
//def cutoffTime = now.minusSeconds(5)
//println cutoffTime

//File file = new File("C:\\UnibosInstalls\\ke\\6.2.10-beta\\Unibos-6.2.10-beta-x64.nsis.7z")
//File file = new File("C:\\UnibosInstalls\\ke\\6.2.29-beta\\Unibos-6.2.29-beta-x64.nsis.7z")
//File file = new File("C:\\users\\fouche\\Desktop\\Unibos-6.2.23-x64.nsis.7z")
//File file = new File("C:\\users\\fouche\\Desktop\\BranchApp\\UF_Kapiri_Conuter_1\\Unibos-6.2.24-x64.nsis.7z")

//File file = new File("C:\\users\\fouche\\Desktop\\Unibos-6.2.29-beta-x64.nsis.7z")
//
//byte[] data = file.readBytes()
//byte[] hash = MessageDigest.getInstance("SHA-512").digest(data)
//String checksum = new BigInteger(1, hash).toString(16)
//println(checksum)
//def newFile = new File("C:\\UnibosInstalls\\zm\\6.2.23\\hash.txt")
//newFile.text = checksum
//println(checksum)


//def data = new URL("https://dev.unibos.co.za/unibos-branch/ke/hash-6.2.11-beta.txt").getText()
//println data


//HttpRequest request = HttpRequest.newBuilder()
//        .uri(new URI("https://dev.unibos.co.za/unibos-branch/ke/hash-6.2.11-beta.txt"))
//        .GET()
//        .build();
//HttpClient client = HttpClient.newBuilder().build();
//HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//println(response.body())


//def pendingDir = new File("C:/UnibosInstalls/ke/6.2.11-beta")

//
////hash-6.2.11-beta.txt
//for (File it in pendingDir.listFiles()) {
//
//    if (it.name.startsWith('temp-'))
//        continue
//
//    if (!latestVersion && it.name.endsWith('.exe')) {
//        latestVersion = it.name
//    }
//    def parts = latestVersion.split("-")
//    if (parts.length > 1) {
//        latestVersion = parts[1]
//    }
//}
//
//println latestVersion

//println InetAddress.getLocalHost().getHostName()

//String latestVersion = 'setup-6.2.8-beta.exe'
//latestVersion = latestVersion - 'Unibos-' - 'setup-' - '-beta' -'.exe'
//println(latestVersion)
//
//latestVersion = 'setup-6.2.8.exe'
//latestVersion = latestVersion - 'Unibos-' - 'setup-' - '-beta' -'.exe'
//println(latestVersion)

//String id = "12345A"
//println(id)
//
//if (id?.contains(" ")) {
//    println("ID number must not contain spaces")
//}
//
//if (!id.isNumber())
//    println("ID number, must be a number")
//else
//    println("Valid")


//String accountNumber = " 12345"
//
//if (accountNumber?.contains(" "))
//    println("Bank account number may  not contain spaces")
//
//if (!accountNumber?.length())
//    println("Bank account number is required")
//
//if (!isDigitsOnly(accountNumber))
//    println("digits - Not a valid bank account number")
//
//def size = accountNumber.length()
//if (size && (size < 6 || size > 13)) {
//    println("length Not a valid bank account number")
//}
//
//static final boolean isDigitsOnly(String string) {
//
//    try {
//        Long.parseLong(string)
//        return true
//    }
//    catch (NumberFormatException e) {
//        return false
//    }
//}

//    print(System.getProperty("user.home"))
//    File file = new File(System.getProperty("user.home") + "/AppData/Local/unibos-updater/test.txt")
//    file << "test content"
//    file.delete()


//String s = "\t"
//
//println()
//if (s?.contains(" ") || s?.contains("\t")) {
//    print("Space or tab detected")
//} else {
//    print("All good")
//}

//String rsp = "{\"result\":{\"Response\":\"Success\",\"Message\":\"Command output follows\",\"data\":\"Privilege: Command\\n-- General --\\nName: PJSIP\\/10002-00000674\\nType: PJSIP\\nUniqueID: 1720000004.2248\\nLinkedID: 1720000001.2247\\nCaller ID: 10002\\nCaller ID Name: 10002\\nConnected Line ID: 27211110888\\nConnected Line ID Name: 27211110888\\nEff. Connected Line ID: 27211110888\\nEff. Connected Line ID Name: 27211110888\\nDNID Digits: (N\\/A)\\nLanguage: en_GB\\nState: Up (6)\\nNativeFormats: (ulaw)\\nWriteFormat: slin\\nReadFormat: slin\\nWriteTranscode: Yes (slin@8000)->(ulaw@8000)\\nReadTranscode: Yes (ulaw@8000)->(slin@8000)\\nTime to Hangup: 0\\nElapsed Time: 0h0m20s\\nBridge ID: 53908004-54cd-4aec-bd31-c9ac3f82bf41\\n--   PBX   --\\nContext: unifi-to-trunk\\nExtension: 10503\\nPriority: 1\\nCall Group: 0\\nPickup Group: 0\\nApplication: AppQueue\\nData: (Outgoing Line)\\nCall Identifer: [C-00000287]\\nVariables:\\nBRIDGEPVTCALLID=4a09a4896e6b8bf04cea3d9a137d0222@169.255.240.155:5160\\nBRIDGEPEER=PJSIP\\/WebRTC_Test-00000673\\nDIALEDPEERNUMBER=10002\\nQC_CONFIRM=0\\nSIGNORE=TRUE\\nRVOL_MODE=dontcare\\nQCONTEXT=0\\nNODEST=10503\\nDIAL_OPTIONS=HhTtrM(auto-blkvm)\\nBLKVM_CHANNEL=PJSIP\\/WebRTC_Test-00000673\\nTTL=64\\nCALLEE_ACCOUNCODE=\\nivrreturn=0\\nIVR_RETVM=\\nIVR_CONTEXT=ivr-1\\nIVR_CONTEXT_ivr-1=\\nCRM_LINKEDID=1720000001.2247\\nCRM_SOURCE=27211110888\\nCRM_DIRECTION=INBOUND\\nCALLINGNUMPRES_SV=allowed_not_screened\\nCALLINGNAMEPRES_SV=allowed_not_screened\\nREVERSAL_REJECT=FALSE\\nMOHCLASS=\\nFROM_DID=27874742660\\nREC_STATUS=RECORDING\\nRECORD_ID=PJSIP\\/WebRTC_Test-00000673\\nMIXMON_ID=0x7f83e07257a0\\nCALLFILENAME=in-27874742660-27211110888-20240703-094641-1720000001.2247\\nREC_POLICY_MODE=FORCE\\nMON_FMT=ogg\\nTIMESTR=20240703-094641\\nYEAR=2024\\nMONTH=07\\nDAY=03\\nDIRECTION=INBOUND\\nCDR Variables:\\nlevel 1: clid=\\\"10002\\\" <10002>\\nlevel 1: src=10002\\nlevel 1: dst=10503\\nlevel 1: dcontext=unifi-to-trunk\\nlevel 1: channel=PJSIP\\/10002-00000674\\nlevel 1: lastapp=AppQueue\\nlevel 1: lastdata=(Outgoing Line)\\nlevel 1: start=1720000004.589867\\nlevel 1: answer=1720000007.584652\\nlevel 1: end=1720000007.588168\\nlevel 1: duration=2\\nlevel 1: billsec=0\\nlevel 1: disposition=8\\nlevel 1: amaflags=3\\nlevel 1: uniqueid=1720000004.2248\\nlevel 1: linkedid=1720000001.2247\\nlevel 1: sequence=2977\\n\\n-- Streams --\\nName: audio-0\\nType: audio\\nState: sendrecv\\nGroup: 0\\nFormats: (ulaw|alaw|g722)\\nMetadata:\\n\"}}"
//String rsp = "{\"result\":{\"Response\":\"Success\",\"Message\":\"Command output follows\",\"data\":\"Privilege: Command\\n-- General --\\nName: PJSIP\\/10002-00000674\\nType: PJSIP\\nUniqueID: 1720000004.11795853\\nLinkedID: 1727704963.11795853\\nCaller ID: 10002\\nCaller ID Name: 10002\\nConnected Line ID: 27211110888\\nConnected Line ID Name: 27211110888\\nEff. Connected Line ID: 27211110888\\nEff. Connected Line ID Name: 27211110888\\nDNID Digits: (N\\/A)\\nLanguage: en_GB\\nState: Up (6)\\nNativeFormats: (ulaw)\\nWriteFormat: slin\\nReadFormat: slin\\nWriteTranscode: Yes (slin@8000)->(ulaw@8000)\\nReadTranscode: Yes (ulaw@8000)->(slin@8000)\\nTime to Hangup: 0\\nElapsed Time: 0h0m20s\\nBridge ID: 53908004-54cd-4aec-bd31-c9ac3f82bf41\\n--   PBX   --\\nContext: unifi-to-trunk\\nExtension: 10503\\nPriority: 1\\nCall Group: 0\\nPickup Group: 0\\nApplication: AppQueue\\nData: (Outgoing Line)\\nCall Identifer: [C-00000287]\\nVariables:\\nBRIDGEPVTCALLID=4a09a4896e6b8bf04cea3d9a137d0222@169.255.240.155:5160\\nBRIDGEPEER=PJSIP\\/WebRTC_Test-00000673\\nDIALEDPEERNUMBER=10002\\nQC_CONFIRM=0\\nSIGNORE=TRUE\\nRVOL_MODE=dontcare\\nQCONTEXT=0\\nNODEST=10503\\nDIAL_OPTIONS=HhTtrM(auto-blkvm)\\nBLKVM_CHANNEL=PJSIP\\/WebRTC_Test-00000673\\nTTL=64\\nCALLEE_ACCOUNCODE=\\nivrreturn=0\\nIVR_RETVM=\\nIVR_CONTEXT=ivr-1\\nIVR_CONTEXT_ivr-1=\\nCRM_LINKEDID=1720000001.2247\\nCRM_SOURCE=27211110888\\nCRM_DIRECTION=INBOUND\\nCALLINGNUMPRES_SV=allowed_not_screened\\nCALLINGNAMEPRES_SV=allowed_not_screened\\nREVERSAL_REJECT=FALSE\\nMOHCLASS=\\nFROM_DID=27874742660\\nREC_STATUS=RECORDING\\nRECORD_ID=PJSIP\\/WebRTC_Test-00000673\\nMIXMON_ID=0x7f83e07257a0\\nCALLFILENAME=in-27874742660-27211110888-20240703-094641-1720000001.2247\\nREC_POLICY_MODE=FORCE\\nMON_FMT=ogg\\nTIMESTR=20240703-094641\\nYEAR=2024\\nMONTH=07\\nDAY=03\\nDIRECTION=INBOUND\\nCDR Variables:\\nlevel 1: clid=\\\"10002\\\" <10002>\\nlevel 1: src=10002\\nlevel 1: dst=10503\\nlevel 1: dcontext=unifi-to-trunk\\nlevel 1: channel=PJSIP\\/10002-00000674\\nlevel 1: lastapp=AppQueue\\nlevel 1: lastdata=(Outgoing Line)\\nlevel 1: start=1720000004.589867\\nlevel 1: answer=1720000007.584652\\nlevel 1: end=1720000007.588168\\nlevel 1: duration=2\\nlevel 1: billsec=0\\nlevel 1: disposition=8\\nlevel 1: amaflags=3\\nlevel 1: uniqueid=1720000004.2248\\nlevel 1: linkedid=1720000001.2247\\nlevel 1: sequence=2977\\n\\n-- Streams --\\nName: audio-0\\nType: audio\\nState: sendrecv\\nGroup: 0\\nFormats: (ulaw|alaw|g722)\\nMetadata:\\n\"}}"
//
//int startIdx = rsp.indexOf("LinkedID:")
//int endIdx = rsp.indexOf("Caller ID:")
//if (startIdx != -1) {
////    println("LinkedID: " + rsp.substring(startIdx+10, startIdx+25).replaceAll("\\\\", ""))
//    println("LinkedID: " + rsp.substring(startIdx+10, endIdx-1).replaceAll("\\\\", ""))
//}
//
//startIdx = rsp.indexOf("Name: PJSIP")
//endIdx = rsp.indexOf("Type: PJSIP")
//if (startIdx != -1) {
//    println("PJSIP: " + rsp.substring(startIdx+6, endIdx-1).replaceAll("\\\\", ""))
//}


String rsp = "{\"result\":{\"Response\":\"Success\",\"Message\":\"Command output follows\",\"data\":\"Privilege: Command\\n\\nEndpoint:  <Endpoint\\/CID.....................................>  <State.....>  <Channels.>\\nI\\/OAuth:  <AuthId\\/UserName...........................................................>\\nAor:  <Aor............................................>  <MaxContact>\\nContact:  <Aor\\/ContactUri..........................> <Hash....> <Status> <RTT(ms)..>\\nTransport:  <TransportId........>  <Type>  <cos>  <tos>  <BindAddress..................>\\nIdentify:  <Identify\\/Endpoint.........................................................>\\nMatch:  <criteria.........................>\\nChannel:  <ChannelId......................................>  <State.....>  <Time.....>\\nExten: <DialedExten...........>  CLCID: <ConnectedLineCID.......>\\n==========================================================================================\\n\\nEndpoint:  10000\\/10000                                          In use        1 of inf\\nInAuth:  10000-auth\\/10000\\nAor:  10000                                              1\\nContact:  10000\\/sip:pdus7fif@41.79.76.253:56049;tran 796e68a9c7 Avail       189.422\\nTransport:  0.0.0.0-wss               wss      3     96  0.0.0.0:5060\\nChannel: PJSIP\\/10000-000010df\\/AppQueue                       Up            00:00:15\\nExten: 10503                     CLCID: \\\"27874742660\\\" <27874742660>\\n\\n\\nParameterName                      : ParameterValue\\n==================================================================================\\n100rel                             : yes\\naccept_multiple_sdp_answers        : false\\naccountcode                        :\\nacl                                :\\naggregate_mwi                      : true\\nallow                              : (ulaw|alaw|gsm|g726|g722)\\nallow_overlap                      : true\\nallow_subscribe                    : true\\nallow_transfer                     : true\\nallow_unauthenticated_options      : false\\naors                               : 10000\\nasymmetric_rtp_codec               : false\\nauth                               : 10000-auth\\nbind_rtp_to_media_address          : false\\nbundle                             : true\\ncall_group                         :\\ncallerid                           : \\\"10000\\\" <10000>\\ncallerid_privacy                   : allowed_not_screened\\ncallerid_tag                       :\\nconnected_line_method              : invite\\ncontact_acl                        :\\ncontext                            : unifi-to-trunk\\ncos_audio                          : 5\\ncos_video                          : 4\\ndevice_state_busy_at               : 0\\ndirect_media                       : false\\ndirect_media_glare_mitigation      : none\\ndirect_media_method                : invite\\ndisable_direct_media_on_nat        : false\\ndtls_auto_generate_cert            : No\\ndtls_ca_file                       :\\ndtls_ca_path                       :\\ndtls_cert_file                     : \\/etc\\/asterisk\\/keys\\/unifidev.bizvoip.co.za.crt\\ndtls_cipher                        :\\ndtls_fingerprint                   : SHA-256\\ndtls_private_key                   : \\/etc\\/asterisk\\/keys\\/unifidev.bizvoip.co.za.key\\ndtls_rekey                         : 0\\ndtls_setup                         : actpass\\ndtls_verify                        : Yes\\ndtmf_mode                          : rfc4733\\nfax_detect                         : false\\nfax_detect_timeout                 : 0\\nfollow_early_media_fork            : true\\nforce_avp                          : false\\nforce_rport                        : true\\nfrom_domain                        :\\nfrom_user                          :\\ng726_non_standard                  : false\\nice_support                        : true\\nidentify_by                        : username,ip\\nignore_183_without_sdp             : false\\ninband_progress                    : false\\nincoming_mwi_mailbox               :\\nlanguage                           : en_GB\\nmailboxes                          :\\nmax_audio_streams                  : 1\\nmax_video_streams                  : 1\\nmedia_address                      :\\nmedia_encryption                   : dtls\\nmedia_encryption_optimistic        : true\\nmedia_use_received_transport       : false\\nmessage_context                    :\\nmoh_passthrough                    : false\\nmoh_suggest                        : default\\nmwi_from_user                      :\\nmwi_subscribe_replaces_unsolicited : no\\nnamed_call_group                   :\\nnamed_pickup_group                 :\\nnotify_early_inuse_ringing         : false\\none_touch_recording                : true\\noutbound_auth                      :\\noutbound_proxy                     :\\npickup_group                       :\\npreferred_codec_only               : false\\nrecord_off_feature                 : apprecord\\nrecord_on_feature                  : apprecord\\nrefer_blind_progress               : true\\nrewrite_contact                    : true\\nrpid_immediate                     : false\\nrtcp_mux                           : true\\nrtp_engine                         : asterisk\\nrtp_ipv6                           : false\\nrtp_keepalive                      : 0\\nrtp_symmetric                      : true\\nrtp_timeout                        : 30\\nrtp_timeout_hold                   : 300\\nsdp_owner                          : -\\nsdp_session                        : Asterisk\\nsend_connected_line                : yes\\nsend_diversion                     : true\\nsend_history_info                  : false\\nsend_pai                           : true\\nsend_rpid                          : false\\nset_var                            :\\nsrtp_tag_32                        : false\\nstir_shaken                        : off\\nsub_min_expiry                     : 0\\nsubscribe_context                  :\\nsuppress_q850_reason_headers       : false\\nt38_bind_udptl_to_media_address    : false\\nt38_udptl                          : false\\nt38_udptl_ec                       : none\\nt38_udptl_ipv6                     : false\\nt38_udptl_maxdatagram              : 0\\nt38_udptl_nat                      : false\\ntimers                             : yes\\ntimers_min_se                      : 90\\ntimers_sess_expires                : 1800\\ntone_zone                          :\\ntos_audio                          : 184\\ntos_video                          : 136\\ntransport                          : 0.0.0.0-wss\\ntrust_connected_line               : yes\\ntrust_id_inbound                   : true\\ntrust_id_outbound                  : false\\nuse_avpf                           : true\\nuse_ptime                          : false\\nuser_eq_phone                      : false\\nvoicemail_extension                :\\nwebrtc                             : no\\n\\n\"}}"

int extLen = "10000".length()
int startIdx = rsp.indexOf("Channel: PJSIP")
int endIdx = startIdx + 14 + extLen + 12
if (startIdx != -1) {
    println("Channel:" + rsp.substring(startIdx+8, endIdx-1).replaceAll("\\\\", ""))
}

//startIdx = rsp.indexOf("Name: PJSIP")
//endIdx = rsp.indexOf("Type: PJSIP")
//if (startIdx != -1) {
//    println("PJSIP: " + rsp.substring(startIdx+6, endIdx-1).replaceAll("\\\\", ""))
//}

//println(["OH","HO","MD","DE"].contains("PU"))
//println(["OH","HO","MD","DE"].contains("HO"))

//def creditDebtor = "CREDIT_DEBTOR:Client:creditDebtor:2020072d1dd4b39647a11eaa655d2faf55c1846"
//def creditDebtor = "CREDIT_DEBTOR:Client:creditDebtor:2019093ecbf194c562b11e99701423fdc8b47b1,AFFILIATE:Affiliate:marketing.affiliate:2019093ece82520562b11e99701423fdc8b47b1"
//String debtor = ""

// CREDIT_DEBTOR:Client:creditDebtor:2019093ecbf194c562b11e99701423fdc8b47b1

//creditDebtor.split(",").each {String val -> {
//    if (val.split(":")[0] == "CREDIT_DEBTOR") {
//        debtor = val.substring(val.lastIndexOf(":")+1)
//    }
//}}
//println(debtor)
//println(creditDebtor.substring(creditDebtor.lastIndexOf(":")+1))

//List<String> ariStates = []
//boolean enabled = ariStates.size() > 0 && ariStates[0].state == "offline"
//println("enabled: " + enabled)
//ariStates = ["offline"]
//enabled = ariStates.size() > 0 && ariStates[0]== "offline"
//println("enabled: " + enabled)

//Date taskDate = new Date()
//println("taskDate: " + taskDate)

//String metric = "Inbound"
//println("unibos.contactcentre.sip." + metric)

//long delay = 24 * 60 * 60 * 1000
//delay = delay + taskDate.getTime()
//
//Date suspendDate = new Date(delay)
//println("suspendDate: " + suspendDate)

//def locale = 'zm'
////if (locale !in ['za']) {
//if (!(locale in ['za'])) {
//    println("Not ZA - process")
//} else {
//    println("Is ZA - do not process")
//}

//String cli = null
//String cli = "0874742660"
//String cli = "0874742660:999"
//
//cli = cli == null ? "" : cli
//cli = cli.contains(":") ? cli.split(":")[1].trim() : cli
//
//println(cli)



//number = normalizeNumber("+27828565009")
//println("number: " + number + " len:" + number.length())
//number = normalizeNumber2("+27828565009")
//println("number: " + number + " len:" + number.length())
//
//println("============")
//number = normalizeNumber("966270907")
//println("number: " + number + " len:" + number.length())
//number = normalizeNumber2("966270907")
//println("number: " + number + " len:" + number.length())
//
//println("============")
//number = normalizeNumber("0630373030")
//println("number: " + number + " len:" + number.length())
//number = normalizeNumber2("0630373030")
//println("number: " + number + " len:" + number.length())

//println("============")
//number = normalizeNumber("+2609799218")
//println("number: " + number + " len:" + number.length())
//number = normalizeNumber2("+2609799218")
//println("number: " + number + " len:" + number.length())
//
//println("============")
//number = normalizeNumber("26097950521")
//println("number: " + number + " len:" + number.length())
//number = normalizeNumber2("26097950521")
//println("number: " + number + " len:" + number.length())


String normalizeNumber(String phoneNumber) {

    String parsedNumber = phoneNumber

    try {

        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance()
        parsedNumber = PhoneNumberUtil.instance.format(phoneUtil.parse(phoneNumber, "ZM"),
                PhoneNumberUtil.PhoneNumberFormat.NATIONAL).replaceAll(" ", "")

    } catch (NumberParseException e) {
        println("Could not parse incoming number")
        println(e.toString())
    } catch (Exception e) {
        println("Could not parse incoming number")
        println(e.toString())
    }

    return parsedNumber
}

String normalizeNumber2(String phoneNumber) {

    String parsedNumber = phoneNumber

    if (phoneNumber?.length() >= 10) {
        if (phoneNumber.startsWith("+")) {
            parsedNumber = "0" + phoneNumber.substring(phoneNumber.length()-9)
        } else {
            parsedNumber = phoneNumber.substring(phoneNumber.length()-10)
        }

    } else {
        parsedNumber = "0" + phoneNumber
    }

    return parsedNumber
}