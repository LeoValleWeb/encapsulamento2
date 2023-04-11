public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Leonardo");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(17);
        System.out.println(pessoa.getIdade());
        pessoa.setCelular("(18)996676771");
        System.out.println(pessoa.getCelular());
        pessoa.setCpf("386.336.908-45");
        System.out.println(pessoa.getCpf());
    }
}
