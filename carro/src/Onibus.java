    public class Onibus extends VeiculoTerrestre{
        private class Motor{
            String modelo;
            public void liga(){
                //questao 14
                System.out.println(modelo + "o onibus pra pavuna esta ligado");
            }

        }
        //usar.... boas praticas
        @Override
        public void liga(){
            //questao 14
            System.out.println(modelo + "o onibus pra pavuna esta ligado");
        }
        private Motor meuMotor;
        //questao 12
        //String modelo;
        public Onibus(String modelo){
            this.modelo = modelo;
            meuMotor = new Motor();
        }
}
