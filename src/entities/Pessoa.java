package entities;

public class Pessoa {
        private String nome;
        private String endereço;
        private double valorPagamento;
        private String contatos;
        public String getEndereço() {
            return endereço;
        }
        public void setEndereço(String endereço) {
            this.endereço = endereço;
        }
        public String getContatos() {
            return contatos;
        }
        public void setContatos(String contatos) {
            this.contatos = contatos;
        }
        public String getNome() {
            return nome;
        }
        public double getValorPagamento() {
            return valorPagamento;
        }
        
        
    }
