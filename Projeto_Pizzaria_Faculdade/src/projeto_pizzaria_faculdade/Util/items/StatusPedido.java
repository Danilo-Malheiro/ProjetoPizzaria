package projeto_pizzaria_faculdade.Util.items;

public enum StatusPedido {
    EM_ABERTO("Em Aberto"), 
    EM_PREPARO("Em Preparo"), 
    ENTREGUE("Finalizado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao; 
    }
    
    public static StatusPedido fromString(String text) {
        for (StatusPedido status : StatusPedido.values()) {
            if (status.descricao.equalsIgnoreCase(text)) {
                return status;
            }
        }
        return null;
    }
}