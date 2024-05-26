package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaseJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {        
        Impressora impressora = new LaseJet();
        impressora.imprimir();

        EquipamentoMultifuncional emf = new EquipamentoMultifuncional();
        // multifuncional pode agir com funcionalidades de Copiadora, Digitalizadora ou Impressora
        Copiadora copiadora = emf; copiadora.copiar();
        Digitalizadora digitalizadora = emf; digitalizadora.digitalizar();
        Impressora impressora2 = emf; impressora2.imprimir();
    }
}
