package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora,  Digitalizadora{

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");        
    }

    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");        
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");        
    }

}
