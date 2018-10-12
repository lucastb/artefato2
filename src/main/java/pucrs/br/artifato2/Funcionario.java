package pucrs.br.artifato2;

public class Funcionario {
	private int matricula, nroDependentes;
	private String nome;
	private double salarioBase;
	private boolean insalubridade;

	public Funcionario(int matricula, String nome, double salarioBase,int nroDependentes, boolean insalubridade) {
		this.matricula=matricula;
		this.nome=nome;
		this.salarioBase=salarioBase;
		this.nroDependentes=nroDependentes;
		this.insalubridade=insalubridade;
	}
	
	/*

	public int getMatricula() {

	}
	public String getNome() {     }
	public double getSalarioBase() {     }
	public int getNroDependentes() {     }
	public boolean getInsalubridade() {     }
	public double getSalarioBruto() {     }
	public double getSalarioLiquido() {     }

	 */

	public int getMatricula() {
		return matricula;
	}

	public int getNroDependentes() {
		return nroDependentes;
	}

	public String getNome() {
		return nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public boolean isInsalubridade() {
		return insalubridade;
	}
}

