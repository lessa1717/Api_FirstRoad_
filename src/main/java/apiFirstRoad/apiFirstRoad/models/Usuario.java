package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "tb_Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_Usuario;

    @Column(name = "nomeUsuario")
    private String nomeUsuario;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "nif")
    private int nif;

    @Column(name = "dataNascimento")
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "Id_tipoUsuario")
    private TipoUsuario tipoUsuario;

    @ManyToOne
    @JoinColumn(name = "Id_unidade")
    private Unidade unidade;

    @ManyToOne
    @JoinColumn(name = "Id_cargo")
    private Cargo cargo;

    // Getters and Setters

    public UUID getId_Usuario() {
        return id_Usuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.id_Usuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
