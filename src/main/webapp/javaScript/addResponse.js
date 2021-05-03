(function () {
    document.addEventListener('DOMContentLoaded', function () {
        fetch("JsonQuestionServlet", {
            method:'post',
            headers: {
                'Content-Type': 'application/json',

            }})
            .then(res => res.json())
            .then(resp => {
                document.getElementById("showQuestion").innerHTML = resp.Question;

                document.getElementById("button1").innerHTML = "<p></p><button  style=\"margin: 3px\" type=\"submit\" class=\"btn btn-secondary\" name=\"questionNumber\" value=\" "+ resp.number + " \"> Submit </button>"+
                   " <a class =\"button\" href=\"/MainPage\"> <button type=\"button\" style=\"margin: 3px\" class=\"btn btn-secondary\">Cancel</button></a> ";

            })
            .catch(e => {
                document.getElementById("showQuestion").innerHTML = "Some error occured!";
            });
    });

})();