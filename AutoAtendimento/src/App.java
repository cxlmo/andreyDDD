class App {
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.nomeCompleto = "Danilo";
        cli.cpf = 12367567;
        cli.rg = "123456x";
        cli.endereco = "Rua rua";

        ContaCorrente cc = new ContaCorrente();
        cc.agencia = 12345;
        cc.numero = 1234567;
        cc.saldo = 23457.90;
        cc.cliente = cli;

        System.out.println(cc.cliente.nomeCompleto);
    }
}