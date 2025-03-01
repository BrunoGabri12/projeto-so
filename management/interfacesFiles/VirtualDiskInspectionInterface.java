package management.interfacesFiles;
import management.exceptions.InvalidSNodeException;

public interface VirtualDiskInspectionInterface {
    	
	/**
     * Metodo que obtem as informacoes de um SNode adiciona nova entrada (diretorio) em um diretorio existente
     * @param snodeId - identiticador do SNode alvo da operacao
     * @return uma representacao (em formato apropriado) do SNode 
     * @throws InvalidSNodeException - se snodeId representar um SNode invalido 
	*/
	public String getSNodeInfo(int snodeId) throws InvalidSNodeException;
	
	/**
     * Metodo que obtem uma representacao do mapa de bits associado ao conjunto de blocos de controle de arquivos
     * @return uma representacao (em formato apropriado) do mapa de bits
	*/
	public String getSnodeBitmap();
	
	/**
     * Metodo que obtem uma representacao do mapa de bits associado ao conjunto de blocos de dados
     * @return uma representacao (em formato apropriado) do mapa de bits
	*/
	public String getDataBlockBitmap();
}
