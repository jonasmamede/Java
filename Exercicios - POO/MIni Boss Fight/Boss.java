public class Boss {
    public int vida;
    public int fases;

    public Boss(int vida) {
        this.vida = vida;
    }

    public void Fases(){
        if (vida >= 75) {
            Ataque ataque = new Ataque();
            ataque.executar();
        }else if(vida >=40 && vida <75){
            AtaqueFogo fogao = new AtaqueFogo();
            fogao.executar();
        }else if(vida >=1 && vida <40){
            RaioLaser raio = new RaioLaser();
            raio.executar();
        }else{
            System.out.println("Morri");
        }
    }

}
