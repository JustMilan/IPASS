let today = new Date();
let currentMonth = today.getMonth();
let currentYear = today.getFullYear();
let selectYear = document.getElementById("year");
let selectMonth = document.getElementById("month");
let monthHeader = document.getElementById("monthHeader");
let yearHeader = document.getElementById("yearHeader");
let nextBtn = document.getElementById("next");
let previousBtn = document.getElementById("previous");
let datePicked = document.getElementById("date-picked");
let months = "";
let days = "";
let monthsArr = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
let daysArr = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
months = monthsArr;
days = daysArr;
let tableHeaderMonth = document.getElementById("thead-month");
let dataHead = "<tr>";
let startDay = "";
for (dhead in days) {
    days[dhead] === "Sun" ? startDay = "red-text" : startDay = "";
    dataHead += "<th data-days='" + days[dhead] + "' class='" + startDay + "'>" + days[dhead] + "</th>";
}
dataHead += "</tr>";
tableHeaderMonth.innerHTML = dataHead;
showCalendar(currentMonth, currentYear);
nextBtn.addEventListener("click", next, false);
previousBtn.addEventListener("click", previous, false);
function yearRange(start, end) {
    let years = "";
    for (let year = start; year <= end; year++) {
        years += "<option value='" + year + "'>" + year + "</option>";
    }
    return years;
}
let createYear = yearRange(1970, 2050);
selectYear.innerHTML = createYear;
function next() {
    currentYear = currentMonth === 11 ? currentYear + 1 : currentYear;
    currentMonth = (currentMonth + 1) % 12;
    showCalendar(currentMonth, currentYear);
}
function previous() {
    currentYear = currentMonth === 0 ? currentYear - 1 : currentYear;
    currentMonth = currentMonth === 0 ? 11 : currentMonth - 1;
    showCalendar(currentMonth, currentYear);
}
function jump() {
    currentYear = parseInt(selectYear.value);
    currentMonth = parseInt(selectMonth.value);
    showCalendar(currentMonth, currentYear);
}
function showCalendar(month, year) {
    let firstDay = new Date(year,month).getDay();
    let monthString = monthsArr[month];
    table = document.getElementById("calendar-body");
    table.innerHTML = "";
    monthHeader.innerHTML = monthString.substring(0, 3);
    yearHeader.innerHTML = year;
    selectYear.value = year;
    selectMonth.value = month;
    let date = 1;
    for (let i = 0; i < 6; i++) {
        let row = document.createElement("tr");
        for (let j = 0; j < 7; j++) {
            if (i === 0 && j < firstDay) {
                cell = document.createElement("td");
                cellText = document.createTextNode("");
                cell.appendChild(cellText);
                row.appendChild(cell);
            } else if (date > daysInMonth(month, year)) {
                break;
            } else {
                cell = document.createElement("td");
                cell.setAttribute("data-date", date);
                cell.setAttribute("data-month", month + 1);
                cell.setAttribute("data-year", year);
                cell.setAttribute("data-month-name", months[month]);
                cell.className = "date-picker";
                cell.innerHTML = "<span>" + date + "</span>";
                cell.onclick = function(event) {
                    let dates = document.querySelectorAll(".date-picker");
                    let currentTarget = event.currentTarget;
                    let date = currentTarget.dataset.date;
                    let month = currentTarget.dataset.month - 1;
                    let year = currentTarget.dataset.year;
                    for (let i = 0; i < dates.length; i++) {
                        dates[i].classList.remove("selected");
                    }
                    currentTarget.classList.add("selected");
                    datePicked.innerHTML = date + " " + monthsArr[month] + " " + year;
                }
                if (date === today.getDate() && year === today.getFullYear() && month === today.getMonth()) {
                    cell.className = "date-picker selected";
                }
                row.appendChild(cell);
                date++;
            }
        }
        table.appendChild(row);
    }
}
function daysInMonth(month, year) {
    return 32 - new Date(year,month,32).getDate();
}
