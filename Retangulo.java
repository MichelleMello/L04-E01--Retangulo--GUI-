
/**
 * Classe projetada para representar retângulos
 * @author Michelle
 */
public class Retangulo {
    
    private int altura;
    private int comprimento;

    /**
     * Retorna o valor da variável de instância altura
     * @return Valor da variável de instância altura
     */
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura <= 0){
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;
    }

    /**
     * Retorna o valor da variável de instância comprimento
     * @return Valor da variável de instância comprimento
     */
    public int getComprimento() {
        return comprimento;
    }
    
    /**
     * Definir o comprimento do retângulo
     * @param comprimento comprimento do retângulo
     */
    public void setComprimento(int comprimento) {
        if(comprimento <= 0){
            throw new RuntimeException("Comprimento inválido");
        }
        this.comprimento = comprimento;
    }

    /**
     * Construtor cria um retângulo com altura igual à 0 e comprimento igual à 0
     */
    public Retangulo() {
        setAltura(0);
        setComprimento(0);
    }

    /**
     * Contrutor cria um retângulo com as medidas passadas pelos parametros
     * @param altura Altura do retângulo
     * @param comprimento Comprimento do retângulo
     */
    public Retangulo(int altura, int comprimento) {
        if(altura <= 0 || comprimento <= 0){
            throw new RuntimeException("Medida inválida");
        }
        setAltura(altura);
        setComprimento(comprimento);
    }
    
    /**
     * Construtor cria um quadrado com a altura/comprimento igual ao parâmetro
     * @param medida Medida do lado do quadrado
     */
    public Retangulo(int medida){
        if(medida <= 0){
            throw new RuntimeException("Medida inválida");
        }
        setAltura(medida);
        setComprimento(medida);
    }
    
    /**
     * Calcula e retorna o perímetro do retângulo
     * @return Perímetro do retângulo
     */
    public int calcularPerimetro(){
        validarMedidas();
        return (2*getAltura()) + (2*getComprimento());
        
    }
    
    /**
     * Calcula a área do retângulo
     * @return Área do retângulo
     */
    public int calcularArea(){
        validarMedidas();
        return altura * comprimento;
    }
    
    /**
     * Método para validar as medidas
     */
    private void validarMedidas(){
        if(getAltura() == 0)
            throw new RuntimeException("Altura não foi definida");
        if(getComprimento()==0)   
             throw new RuntimeException("Comprimento não foi definida");
    }
    
    
}
