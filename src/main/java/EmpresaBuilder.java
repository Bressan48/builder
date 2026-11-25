package padroescriacao.builder;

import java.util.Date;

public class EmpresaBuilder {

    private Empresa empresa;

    public EmpresaBuilder() {
        empresa = new Empresa();
    }

    public Empresa build() {
        if (empresa.getCnpj().equals("")) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        if (empresa.getRazaoSocial().equals("")) {
            throw new IllegalArgumentException("Razão social inválida");
        }
        return empresa;
    }

    public EmpresaBuilder setCnpj(String cnpj) {
        empresa.setCnpj(cnpj);
        return this;
    }

    public EmpresaBuilder setRazaoSocial(String razaoSocial) {
        empresa.setRazaoSocial(razaoSocial);
        return this;
    }

    public EmpresaBuilder setDataFundacao(Date dataFundacao) {
        empresa.setDataFundacao(dataFundacao);
        return this;
    }

    public EmpresaBuilder setNomeFantasia(String nomeFantasia) {
        empresa.setNomeFantasia(nomeFantasia);
        return this;
    }

    public EmpresaBuilder setInscricaoEstadual(String inscricaoEstadual) {
        empresa.setInscricaoEstadual(inscricaoEstadual);
        return this;
    }

    public EmpresaBuilder setInscricaoMunicipal(String inscricaoMunicipal) {
        empresa.setInscricaoMunicipal(inscricaoMunicipal);
        return this;
    }

    public EmpresaBuilder setNaturezaJuridica(String naturezaJuridica) {
        empresa.setNaturezaJuridica(naturezaJuridica);
        return this;
    }

    public EmpresaBuilder setRamoAtividade(String ramoAtividade) {
        empresa.setRamoAtividade(ramoAtividade);
        return this;
    }

    public EmpresaBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        empresa.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public EmpresaBuilder setEnderecoNumero(int enderecoNumero) {
        empresa.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public EmpresaBuilder setEnderecoComplemento(String enderecoComplemento) {
        empresa.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public EmpresaBuilder setEnderecoBairro(String enderecoBairro) {
        empresa.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public EmpresaBuilder setEnderecoCidade(String enderecoCidade) {
        empresa.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public EmpresaBuilder setEnderecoUF(String enderecoUF) {
        empresa.setEnderecoUF(enderecoUF);
        return this;
    }

    public EmpresaBuilder setCep(String cep) {
        empresa.setCep(cep);
        return this;
    }

    public EmpresaBuilder setEmail(String email) {
        empresa.setEmail(email);
        return this;
    }

    public EmpresaBuilder setTelefone(String telefone) {
        empresa.setTelefone(telefone);
        return this;
    }

}
