<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
  </head>
  <body>
    <h1>Classe EmailServiceImpl</h1>
    <p>Esta classe implementa a interface <code>EmailService</code>.</p>
    <h2>Métodos</h2>
    <h3>sendEmail</h3>
    <p><code>@Override</code></p>
    <p>Método responsável por enviar um email e salvar as informações no banco de dados utilizando o repositório <code>EmailRepository</code>.</p>
    <p><strong>Parâmetros:</strong> Objeto <code>Email</code> contendo as informações do email a ser enviado.</p>
    <p><strong>Retorno:</strong> Objeto <code>Email</code> atualizado com o status do envio.</p>
    <ul>
      <li><strong>emailSender:</strong> <code>JavaMailSender</code> - Objeto responsável por enviar o email.</li>
      <li><strong>emailRepository:</strong> <code>EmailRepository</code> - Objeto responsável por salvar as informações do email no banco de dados.</li>
    </ul>
    <hr>
  </body>
</html>
