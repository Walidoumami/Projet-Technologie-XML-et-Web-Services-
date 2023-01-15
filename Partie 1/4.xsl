<? xml version="1.0 »  encoding="UTF-8 »?>
<xsl:feuille de style xmlns:xsl="http://www.w3.org/1999/XSL/Transform »
    xmlns:xs="http://www.w3.org/2001/XMLSchema »
    exclude-result-prefixes="xs »
    version="1.0 »>
    <xsl:correspondance de modèle ="/">
        <.html>
            <tête>
                <titre>Q4</titre>
            </tête>
            <corps>
                <h2>Relevé Bancaire RIB : <xsl:value-of select="releve/@RIB"/></h2>
                <h2>Date de relevé : <xsl:value-of select="releve/dateReleve"/></h2>
                <h2>Solde de relevé : <xsl:value-of select="releve/solde"/></h2>
                <table border="1 »>
                    <Tr>
                        <th>Type</th>
                        <th>Date</th>
                        <th>Montant</th>
                        <th>Description</th>
                    </Tr>
                    <xsl:for-each select="releve/operations/operation »>
                        <Tr>
                            <td><xsl:valeur-de select="@type"/></td>
                            <td><xsl:valeur-de select="@date"/></td>
                            <td><xsl:valeur-de select="@montant"/></td>
                            <td><xsl:valeur-de select="@description"/></td>
                        </Tr>
                    </xsl:pour-chaque>
                    <Tr>
                        <td colspan="2">Total débit</td>
                        <td colspan="2"><xsl:value-of select="sum(releve/operations/operation[@type = 'CREDIT']/@montant)"/></td>
                    </Tr>
                    <Tr>
                        <td colspan="2">Total débit</td>
                        <td colspan="2"><xsl:value-of select="sum(releve/operations/operation[@type = 'DEBIT']/@montant)"/></td>
                    </Tr>
                </table>
            </corps>
        </.html>
    </xsl:modèle>
</xsl:feuille de style>
