package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifucional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifucional em = new EquipamentoMultifucional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();
    }
}
