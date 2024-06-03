package map.ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }

    // como queremos ordenar usaremos aqui o TreeMap
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        // tem que ser de hoje em diante!

            // Set<LocalDate> dataSet =  eventosMap.keySet();// retorna Set com a cahves
           // Collection<Evento> valores = eventosMap.values();// retorna uma Coleção com todos os valores
            // estas variáveis acima não se conhecem, não tem relações

        // prciso de início saber a data atual -> LocalDate.now()
        LocalDate dataAtual = LocalDate.now();
        // abaixo tenho os eventos ordenados
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) { 
          // pode usar 'var' vs Map.Entry      // o método 'entrySet' consigo retorna um Set com a ligação chave valo (K,V)
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento: "+ entry.getValue()+
                " acontecerá na data "+entry.getKey());
                break;
            }    
        }
    }
}
