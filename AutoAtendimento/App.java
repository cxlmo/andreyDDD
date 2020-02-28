class App {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.nomeCompleto = "Coco";
        cli.cpf = 123456789;
        cli.rg = "12345678x";
        cli.endereco = "Rua X";

        ContaCorrente cc = new ContaCorrente();
        cc.agencia = 1234;
        cc.numero = 122346;
        cc.saldo = 123.34;
        cc.cliente = cli;
    }
    System.out.println(cc.cliente.nomeCompleto)
}