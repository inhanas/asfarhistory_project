function getNumber({ value, defaultValue }) {
    const num = parseInt(value, 10);
    return isNaN(num) ? defaultValue : num;
}
