fetch("http://totvslabs.devfluigidentity.com/api/auth/v1/token", {
  "credentials": "include",
  "headers": {
    "accept": "*/*",
    "accept-language": "pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7",
    "cache-control": "no-cache",
    "content-type": "application/x-www-form-urlencoded",
    "pragma": "no-cache"
  },
  "referrer": "http://totvslabs.devfluigidentity.com/ui/login?emailAddress=admin@totvslabs.com&password=Totvs@123",
  "referrerPolicy": "no-referrer-when-downgrade",
  "body": "grant_type=password&domain=totvslabs&username=admin%40totvslabs.com&password=Totvs%40123",
  "method": "POST",
  "mode": "cors"
}).then(resp => resp.json()).then(data => console.log(data));
