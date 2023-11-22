/**
 * 
 */
package controle;

/**
 * 
 */
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class AutomovelBean {
	private ArrayList<String> tipos;
	private ArrayList<String> servicos;
	private String tipo;
	private String servico;
	
	public AutomovelBean() {
		tipos = new ArrayList<String>();
		tipos.add("Automóvel");
		tipos.add("Moto");
		servicos = new ArrayList<String>();
		servicos.add("Troca de pneus");
		servicos.add("Troca de óleo");
		servicos.add("Troca de pastilhas de freio");
		servicos.add("Injeção eletrônica");
		servicos.add("Reparos em motores");
		servicos.add("Sistema elétrico");
		servicos.add("Suspensão");
	}
	
	public ArrayList<String> getTipos(){
		return tipos;
	}
	
	public ArrayList<String> getServicos(){
		return servicos;
	}

	public void setTipos(ArrayList<String> tipos) {
		this.tipos = tipos;
	}

	public void setServicos(ArrayList<String> servicos) {
		this.servicos = servicos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
}
