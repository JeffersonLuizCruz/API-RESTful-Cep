# Simples projeto de consulta de cep

1. Um and-point de consulta de cep / GET
- Caso o cep não seja encontrado é efetuado uma busca no endereço www.viacep.com.br
2. Um and-point para salvar o cep / POST
- Salvar cep na base de dados

## Rota[GET]
- [GET] http://{host-url}/api/cep/00000000

### Resposta:
```
{
	"id": "",
	"cep": "",
	"logradouro": "",
	"complemento": "",
	"bairro": "",
	"localidade": "",
	"uf": "",
	"unidade": "",
	"ibge": ""
}
```

## Rota [POST]
- [POST] http://{host-url}/api/cep

### Body:
```
{
	"cep": "",
	"logradouro": "",
	"complemento": "",
	"bairro": "",
	"localidade": "",
	"uf": "",
	"unidade": "",
	"ibge": ""
}
```

### Resposta:
```
{
	"id": "",
	"cep": "",
	"logradouro": "",
	"complemento": "",
	"bairro": "",
	"localidade": "",
	"uf": "",
	"unidade": "",
	"ibge": ""
}
```

## Requisitos:
- [x] Java 11<br>
- [x] DTO<br>
- [x] Java Swagger2 Swagger-ui<br>
- [x] Java 11
