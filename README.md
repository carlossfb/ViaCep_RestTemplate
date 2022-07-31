# ViaCep_RestTemplate
Consumindo a Api Viacep utilizando RestTemplate

## 1º Passo -> Criar a classe CEP com todas as propriedades necessárias
 Criar uma função publica onde receberá um cep, após isso nós daremos return em um RestTemplate, utilizando a url do site que retorna JSON e concatenando com a variavel cep que estavamos recebendo via parâmentro... O getBody converte para nós para que o retorno seja um CEP assim como pedimos ao declarar o tipo de retorno.

    public Cep run(String cepUSer){
        return  new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cepUSer+"/json/", Cep.class).getBody();
    }
    
## 2º Passo -> Testar o retorno do Json 
usando um GetMapping para através da URL usarmos a busca da api VIACEP, repare que utilizamos uma interpolação do cep para indicar que o valor será recebido na PathVariable e colocado na var cepUSer, após isso rodamos a nossa restTemplate usando o cep recebido pela URL como parâmetro, o retorno embaixo nos dá um JSON de saída, mas é opcional esse tipo de retorno, poderia ter sido feito diferente também, só alterar o tipo de retorno do método. ** O acesso para a api se dá através de **/cep/SEUCEP

    @GetMapping("/cep/{cep}")
    public ResponseEntity<Cep> hello(@PathVariable("cep") String cepUser){

      Cep cep = run(cepUser);
      return ResponseEntity.ok(cep);
    }


