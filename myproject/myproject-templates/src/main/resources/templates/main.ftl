<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" version="XHTML+RDFa 1.0" dir="ltr">
<head><title></title></head>
<body>
<h1>Test</h1>
<#if dog??>
<p>
    Hello ${dog.name},
    <#if dog.breed??>
        I see you are a ${dog.breed}.
    </#if>
</p>
</#if>
<#if someguy??>
<p>
    Is ${someguy.firstName} your person?
</p>
</#if>
</body>
</html>

