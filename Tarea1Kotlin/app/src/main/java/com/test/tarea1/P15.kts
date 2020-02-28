package com.test.tarea1

fun duplicateN(n: Int, lista: ArrayList<Char>):ArrayList<Char>{
    var nuevaLista: ArrayList<Char> = ArrayList();
    for( a in lista){
        for (i in 1..n){
            nuevaLista.add(a);
        }
    }
    return nuevaLista;
}

var result = duplicateN(3, arrayListOf('a','b','c','c','d'))

for(a in result){
    print(a);
}
println("\n-----")

result = duplicateN(3, arrayListOf('a','c','c','c','d'))

for(a in result){
    print(a);
}
println("\n-----")

result = duplicateN(2, arrayListOf('a','a','c','c','d'))

for(a in result){
    print(a)
}
println("\n-----")

result = duplicateN(1, arrayListOf('H','o','l','a',' ', 'M', 'u', 'n', 'd', 'o', '!'))

for(a in result){
    print(a);
}
println("\n-----")