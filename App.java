public class App {
    public static void main(String[] args) throws Exception {
        Gerente gerente = new Gerente();
        Vendedor Vendedor = new Vendedor();
        Secretaria secretaria = new Secretaria();


        Secretaria.setSalarioBase(1500);
        gerente.setSalarioBase(5000);
        gerente.setAbono(200);

        Vendedor.setSalarioBase(2000);
        Vendedor.setSalarioBase(500);
        Vendedor.CalcularPagamento();

        System.out.println(gerente.pagamentoTotal());
        System.out.println(Vendedor.CalcularPagamento());
        System.out.println(secretaria.getDepartamento());
    }
}
