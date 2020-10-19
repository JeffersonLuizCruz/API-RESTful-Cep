# Simples projeto de consulta de cep

1. Um and-point de consulta de cep / GET
- Caso o cep não seja encontrado é efetuado uma busca no endereço www.viacep.com.br
2. Um and-point para salvar o cep / POST
- Salvar cep na base de dados

## Rota[GET]
- [GET] http://{host-url}/api/cep/00000000

### Resposta:
{<br>
	"id": "",<br>
	"cep": "",
	"logradouro": "",<br>
	"complemento": "",<br>
	"bairro": "",<br>
	"localidade": "",<br>
	"uf": "",<br>
	"unidade": "",<br>
	"ibge": ""<br>
}

## Rota [POST]
- [POST] http://{host-url}/api/cep

### Body:
{<br>
	"cep": "",<br>
	"logradouro": "",<br>
	"complemento": "",<br>
	"bairro": "",<br>
	"localidade": "",<br>
	"uf": "",<br>
	"unidade": "",<br>
	"ibge": ""<br>
}

### Resposta:
{<br>
	"id": "",<br>
	"cep": "",<br>
	"logradouro": "",<br>
	"complemento": "",<br>
	"bairro": "",<br>
	"localidade": "",<br>
	"uf": "",<br>
	"unidade": "",<br>
	"ibge": ""<br>
}

## Requisitos:
- [ ] Java 11<br>
- [ ] DTO<br>
- [ ] Java Swagger2 Swagger-ui<br>
- [ ] Java 11
