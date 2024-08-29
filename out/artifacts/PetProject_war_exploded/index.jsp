<html>
<head>
    <meta charset=utf-8>
    <title>MorseTranslator</title>
    <style>
        .navigationBar {
            text-align: center;
            font-size: 45px;
            margin: 40px 0;
        }
        .container {
            display: flex;
            justify-content: center;
            margin-top: 180px;
        }
        .inputArea{
            margin-right: 50px;
        }
        label {
            display: block;
            font-size: 30px;
        }
        .textarea-container {
            display: flex;
            align-items: center;
        }
        .translate-button {
            font-size: 30px;
            padding: 15px 30px;
            margin-left: 50px;
        }
    </style>

    </head>
    <body>
    <header class="navigationBar">MORSE TRANSLATOR</header>
    <main>
        <div class="container">

        <div class="inputArea">
            <form id="formOne" action="morseTranslator" method="post">
                <label for="inputArea">Text</label>

                <div class="textarea-container">
                    <textarea id="inputArea" name="inputArea" style="font-size: 25px" cols="25" rows="6"><%=request.getAttribute("inputArea") != null ? request.getAttribute("inputArea") : ""%></textarea>
                    <input type="submit" value="Translate" class="translate-button">
                </div>
            </form>
        </div>

        <div class="outputArea">
            <label for="outputArea">Morse</label>
            <textarea id="outputArea" name="outputArea" style="font-size: 25px" cols="25" rows="6"><%=request.getAttribute("outputArea") != null ? request.getAttribute("outputArea") : ""%></textarea>
        </div>

        </div>
    </main>
    </body>
    </html>
