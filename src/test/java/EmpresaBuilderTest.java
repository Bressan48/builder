package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaBuilderTest {

    @Test
    void deveRetornarExcecaoParaEmpresaSemCnpj() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setRazaoSocial("Empresa 1")
                    .setEmail("empresa1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CNPJ inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaEmpresaSemRazaoSocial() {
        try {
            EmpresaBuilder empresaBuilder = new EmpresaBuilder();
            Empresa empresa = empresaBuilder
                    .setCnpj("12.345.678/0001-90")
                    .setEmail("empresa1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Razão social inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarEmpresaValida() {
        EmpresaBuilder empresaBuilder = new EmpresaBuilder();
        Empresa empresa = empresaBuilder
                .setCnpj("12.345.678/0001-90")
                .setRazaoSocial("Empresa 1")
                .setEmail("empresa1@email.com")
                .build();

        assertNotNull(empresa);
    }
}
