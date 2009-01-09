package br.com.caelum.stella.nfe.builder.icms;

import java.math.BigDecimal;

import br.com.caelum.stella.nfe.builder.icms.enums.OrigemICMS;

public interface ICMSCobradoAnteriormentePorSubstituicao extends ICMS {

    public ICMSCobradoAnteriormentePorSubstituicao withOrigem(OrigemICMS origem);

    public ICMSCobradoAnteriormentePorSubstituicao withValorBaseCalculoSubstituicaoTributaria(
            BigDecimal valorBaseCalculo);

    public ICMSCobradoAnteriormentePorSubstituicao withValorSubstituicaoTributaria(
            BigDecimal valorSubstituicaoTributaria);
}