This is working example of soap service 

Request is 

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gs="http://www.bodhee.ai/connector/soap">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getCountryRequest>
            <gs:name>Spain</gs:name>
        </gs:getCountryRequest>
   </soapenv:Body>
</soapenv:Envelope>

Response is 

<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <getCountryResponse xmlns="http://www.bodhee.ai/connector/soap">
            <country>
                <name>Spain</name>
                <population>46704314</population>
                <capital>Madrid</capital>
                <currency>EUR</currency>
            </country>
        </getCountryResponse>
    </soap:Body>
</soap:Envelope>