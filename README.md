# Sistema de Locação de Meios de Transporte Individuais

## Descrição
Este projeto foi desenvolvido para gerenciar a locação de meios de transporte individuais utilizando o padrão de projeto *Abstract Factory*. Ele organiza a criação de transportes em categorias específicas:

- *Movidos a bateria*: Patinetes elétricos, bicicletas elétricas.
- *Movidos por esforço humano*: Bicicletas tradicionais, patins, skates.

O sistema garante que cada meio de transporte seja criado de forma adequada à sua categoria, utilizando fábricas especializadas.

---

## Estrutura do Projeto

O projeto segue a organização abaixo:



---

## Requisitos Técnicos
- *Interface*: A interface `Transport` define o método `void ride()`, que exibe uma mensagem indicando o uso do meio de transporte.
- *Classes Concretas*: Implementam os diferentes meios de transporte individuais.
- *Fábricas*:
    - `ElectricTransportFactory`: Produz meios de transporte movidos a bateria.
    - `HumanPoweredTransportFactory`: Produz meios de transporte movidos por esforço humano.
- *Main*: Contém a lógica principal para demonstrar o funcionamento das fábricas.

---

## Exemplo de Funcionamento
Segue um exemplo prático do funcionamento do sistema:

```java
public class Main {
    public static void main(String[] args) {
        // Fábrica para transportes elétricos
        TransportFactory electricFactory = new ElectricTransportFactory();
        Transport electricBike = electricFactory.createBike();
        electricBike.ride();

        // Fábrica para transportes não motorizados
        TransportFactory humanFactory = new HumanPoweredTransportFactory();
        Transport skateboard = humanFactory.createSkate();
        skateboard.ride();
    }
}



Usando uma Bicicleta Elétrica.
Usando um Skate.


git clone <URL_DO_SEU_REPOSITORIO>


javac -d bin src/com/example/transport/*.java


java -cp bin com.example.transport.Main


As alterações foram realizadas para melhorar a fluidez e variar a escolha das palavras, mantendo a clareza e o significado original.



