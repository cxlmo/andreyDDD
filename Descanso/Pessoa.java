class Pessoa {
    String nome;
    String rg;
    int cpf;
    String dataNascimento;
    String endereco;
    

    void exibirDadosPessoais();
        System.out.printf("Nome: %s\nRG: %s\nCPF: %d\nData de nascimento: %s\n",nome, rg, cpf, dataNascimento);
}

String informeEndereco(){
    return endereco;
}