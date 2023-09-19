package edu.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefasList;

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Quantas tarefas existem nessa lista? " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa2");
        System.out.println("Quantas tarefas existem nessa lista? " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("Tarefa1");
        listaTarefas.adicionarTarefa("Tarefa2");
        System.out.println("Quantas tarefas existem nessa lista? " + listaTarefas.obterNumeroTotalTarefas());
        // listaTarefas.removerTarefa("Tarefa2");
        System.out.println("Quantas tarefas existem nessa lista? " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();

    }

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String tarefa) {
        List<Tarefa> tarefasToRemove = new ArrayList<>();
        for (Tarefa t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(tarefa)) {
                tarefasToRemove.add(t);
            }
        }
        tarefasList.removeAll(tarefasToRemove);
    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefasList);
    }
}
