class Usuario {

    var nome = "";

    constructor(nome: String) {
        this.nome = nome
    }


}


fun main() {


    val usuarios = listOf(
        Usuario("ana"),
        Usuario("joao"),
        Usuario("maria"),
        Usuario("bruna"),
        Usuario("gabriel"),
        Usuario("katia"),

    )

    usuarios.forEach {
        println("Aluno Matriculado -> "+it.nome)
    }


}