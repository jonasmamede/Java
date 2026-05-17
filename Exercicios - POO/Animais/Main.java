public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Animal [] animais = new Animal[2];
        animais[0] =gato;
        animais [1] = cachorro;
        for (int index = 0; index < animais.length; index++) {
            System.out.println(animais[index]);
        }
        }
    }

