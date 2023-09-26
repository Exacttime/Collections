package map.AgendaDeEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public static void main(String[] args) {
    AgendaEventos agendaEventos = new AgendaEventos();
    agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 10), "Evento1", "Atracao cantores");
    agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 23), "Evento2", "Atracao dançarinos");
    agendaEventos.exibirAgenda();
    agendaEventos.exibirProximoEvento();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    Evento evento = new Evento(nome, atracao);
    eventosMap.put(data, evento);
  }

  public void exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    System.out.println(eventosTreeMap);
  }

  public void exibirProximoEvento() {
    // Set<LocalDate> dateSet = eventosMap.keySet();
    // Collection<Evento> values = eventosMap.values();
    // eventosMap.get();
    LocalDate dataAtual = LocalDate.now();
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
      if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
        System.out.println("O proximo evento é: " + entry.getValue() + "Acontecera na data " + entry.getKey());
        break;
      }
    }
  }
}
