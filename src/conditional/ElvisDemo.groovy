package conditional

def msg
// if the variable evaluates to true use it, otherwise use the default
def elvisOutput = msg ?: 'Some Default Value'
println elvisOutput