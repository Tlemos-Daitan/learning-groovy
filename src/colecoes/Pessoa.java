class Pessoa{
    String nome
    String sobreNome
    int idade

    public Pessoa (nome, sobreNome, int idade) {
        this.nome = nome
        this.sobreNome = sobreNome
        this.idade = idade

    }
    
    String toString () {
        "${this.nome} ${this.sobreNome} - ${this.idade}"
    }

    public boolean equals (obj) {
        return (obj.nome == this.nome) && (obj.sobrenome = this.sobreNome)
    }
}