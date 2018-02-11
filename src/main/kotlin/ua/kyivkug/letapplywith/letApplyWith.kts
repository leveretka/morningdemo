package ua.kyivkug.letapplywith

println (".let : " + "Margo".let { it.length })

println (".apply : " + "Margo".apply { length })

println (".run : " + "Margo".run { length })

println (".also : " + "Margo".also { it.length })

println ("with(.) : " + with("Margo") { length })

println ("run{.} : " + run {"Margo".length})