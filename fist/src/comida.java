
    public class comida {
        public static void main(String[] args) {
            // Código do animal para o qual queremos saber a comida favorita
            int codigoAnimal = 1;
            String comidaFavorita;

            // Utilizando o switch case para determinar a comida favorita
            switch (codigoAnimal) {
                case 1:
                    comidaFavorita = "Bambu";
                    break; // Importante para sair do switch após encontrar o caso correto
                case 2:
                    comidaFavorita = "Carne";
                    break;
                case 3:
                    comidaFavorita = "Frutas";
                    break;
                default:
                    comidaFavorita = "Comida não identificada";
                    break; // Caso o código do animal não corresponda a nenhum caso
            }

            // Imprime a comida favorita do animal
            System.out.println("A comida favorita do animal com código " + codigoAnimal + " é: " + comidaFavorita);
        }
    }

