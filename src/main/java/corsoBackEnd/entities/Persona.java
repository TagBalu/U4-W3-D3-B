package corsoBackEnd.entities;

import jakarta.persistence.*;



public class Persona {
    @Entity
    @Table(name = "persona")
    public class persona{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", updatable = false, nullable = false)
        private Long id;

        public String nome;

        public String cognome;

        public String email;

        public int dataDiNascita;

        @Enumerated(EnumType.STRING)
        private Sesso sesso;
        public String ListaPartecipanti;


        public persona(String nome, String cognome, String email, int dataDiNascita, String listaPartecipanti) {
            this.nome = nome;
            this.cognome = cognome;
            this.email = email;
            this.dataDiNascita = dataDiNascita;
            ListaPartecipanti = listaPartecipanti;
        }
    }
}
