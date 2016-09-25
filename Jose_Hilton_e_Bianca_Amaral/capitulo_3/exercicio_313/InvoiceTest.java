package exercicio_313;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice("2","Conectores de energia.", 10, 7.00);
		System.out.println("Número: "+invoice.getNumero()+"\nDescrição: "+invoice.getDescricao()+"\nQuantidade: "+invoice.getQuantidade()+"\nValor por item: "+ invoice.getPreco());
		invoice.getInvoiceAmount(invoice.getQuantidade(), invoice.getPreco());
	}

}
