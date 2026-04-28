# GruppprojektAPI
## Detlagare: Malmö 2 Gruppen
Jonathan Iskasson, Konstantinos Nascos, Felix Lidén, Markus Nikolic, Rasha Knifdi, Jonatan Emil Dahl.
## JWT
**Username:** *user*
**Password:** *password*

## OAuth2
Login via Github account

## Jämförelse
### JWT 
Utger mindre säkerhet i jämförelse till OAuth2 men befriar dig ifrån att använda ett tredjeparti tjänst som Google. Med mindre säkerhet generellt så kräver det också högre anvsar för att skydda den information och datan för användare av tjänsten. Sessionstillståndet är mer flexibelt och mer generöst eftersom informationen ligger i tokenen.

Man måste också tillföhålla sig till kraven som den externa providern sätter för att de ska tillåta att sidan att använda deras tjänst. Om sitt syfte devierar på något sätt ifrån den externa providern kan rättigheterna att använda dem tas bort. Utgifter kan också tillkomma ifall inloggningar och användninga av tjänsten når ett visst antal/gräns. För stora appar/hemsidor/tjänster blir detta nog en faktor att hålla koll på.

**Sammanfattningsvis** så kräver JWT att man bygger ett säkerhetsystem från grunden.

### OAuth2
Ger en säkrare tjänst och behöver mindre kod att implementera än JWT då det mesta hanteras via Oauth2 och den tredjeparti som t.ex Google hanterar authentication och lagring av data. Så det befriar en mycket ifrån jobb och anvsar. På bekostnad till full beroende och tillförlit att dem tjänsterna fungerar och är säkra.

**Sammanfattningsvis** OAuth2 är bra när man vill låta användaren logga in via en extern provider och slippa hantera hela identitetsdelen själva. Utan deligerar detta till en annan tjänst.
