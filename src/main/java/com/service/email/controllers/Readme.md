<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>
    <h1>Classe EmailController</h1>
    <p>Esta classe é responsável por controlar as requisições relacionadas ao envio de emails.</p>
    <h2>Métodos</h2>
    <h3>sendingEmail</h3>
    <p><code>@PostMapping("/sending-email")</code></p>
    <p>Método responsável por enviar um email utilizando o serviço <code>EmailService</code>.</p>
    <p><strong>Parâmetros:</strong> 
    <ul>
      <li><code>emailDto</code> - Objeto <code>EmailDto</code> contendo as informações do email a ser enviado.</li>
    </ul>
    </p>
    <p><strong>Retorno:</strong> Objeto <code>ResponseEntity</code> contendo o objeto <code>Email</code> enviado e o status da resposta.</p>
    <ul>
      <li><strong>emailService:</strong> <code>EmailService</code> - Serviço responsável por enviar o email.</li>
    </ul>
    <hr>
  </body>
</html>
