
/**
 * Esta clase genera todos los número primos de 1 has eun número 
 * máximo especificado por el usuario utilzando la criba de  Eratóstenes.
 * 
 * Eratóstenes de Cirene (en griego antiguo Ἐρατοσθένης, Eratosthénēs) 
 * (Cirene, 276 a. C.1​-Alejandría, 194 a. C.) fue un matemático, astrónomo 
 * y geógrafo griego de origen cirenaico. Concibió por primera vez la geografía 
 * como una disciplina sistemática, desarrollando una terminología que todavía 
 * se usa en la actualidad.2​ Eratóstenes es conocido principalmente por ser 
 * la primera persona en calcular la circunferencia de la Tierra, lo que hizo 
 * al comparar las altitudes del sol del mediodía en dos lugares separados por 
 * una distancia Norte-Sur
 * 
 * Dado un vector de enteros empezando en 2, se tachan todos los múltiplos
 * de 2. A continuación se encuentra el siguiete entero no tachado y se 
 * tachan sus múltiplos. Cuando se llega a la raiz cuadrada del valor máximo,
 * los número que quedan sin tachar son los números primos
 * 
 * @author anonimo
 * @version 1.0 Febrero 2018
 */
public class Criba
{
    /**
     * Generar números primos de 1 a max
     * @param max es el valor maximo
     * @return vector de números primos
     */
    public static int[] generarPrimos (int max)
    {
        int i,j;
        
        if (max >= 2)
        {
            //Declaraciones
            int dim = max + 1;
            boolean[] esPrimo = new boolean[dim];
            
            //Inicializar array
            for (i=0; i<dim; i++)
                esPrimo[i] = true;
            
            //Eliminar el 0 y el 1 que no son primos
            esPrimo[0] = false;
            esPrimo[1] = false;
            
            //Criba
            for (i=2; i<Math.sqrt(dim)+1;i++)
            {
                if (esPrimo[i])
                {
                    for(j=2*i; j<dim; j+=i)
                        esPrimo[j]= false;
                }
            }
            
            //¿Cuantos primos hay?
            int cuenta = 0;
            
            for (i=0;i<dim;i++)
            {
                if (esPrimo[i])
                    cuenta++;
            }
            
            //Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            
            for (i=0,j=0; i<dim;i++)
            {
                if(esPrimo[i])
                    primos[j++]=i;
            }
            
            return primos;
        }
        else //Menor de 2
        {
            return new int[0]; //Vector vacio
        }
    };

    
}
