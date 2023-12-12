package apiFirstRoad.apiFirstRoad.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "nif")
    private int nif;

    @Column(name = "data_nascimento")
    private Date data_nascimento;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario")
    private TipoUsuario id_tipo_usuario;

    @ManyToOne
    @JoinColumn(name = "id_unidade")
    private Unidade id_unidade;

    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private Cargo id_cargo;

    @Column(name = "url_imagem")
    private String url_imagem;
    // Getters e Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nome;
    }

    public void setNomeUsuario(String nome) {
        this.nome = nome;
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

    public Date getDataNascimento() {
        return data_nascimento;
    }

    public void setDataNascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public TipoUsuario getTipoUsuario() {
        return id_tipo_usuario;
    }

    public void setTipoUsuario(TipoUsuario id_tipoUsuario) {
        this.id_tipo_usuario = id_tipo_usuario;
    }

    public Unidade getUnidade() {
        return id_unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.id_unidade = id_unidade;
    }

    public Cargo getCargo() {
        return id_cargo;
    }

    public void setCargo(Cargo cargo) {
        this.id_cargo = id_cargo;
    }

    public String getUrlimagem() {
        return url_imagem;
    }

    public void setUrlimagem(String url_imagem) {
        this.url_imagem = url_imagem;
    }
}
