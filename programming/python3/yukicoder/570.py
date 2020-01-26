def main():
    hA = int((input()))
    hB = int((input()))
    hC = int((input()))

    if hA > hB:
        temp_max = {"name": "A", "height": hA}
        temp_min = {"name": "B", "height": hB}
    else:
        temp_max = {"name": "B", "height": hB}
        temp_min = {"name": "A", "height": hA}

    if temp_min["height"] > hC:
        temp_mid = temp_min
        temp_min = {"name": "C", "height": hC}
    elif temp_max["height"] < hC:
        temp_mid = temp_max
        temp_max = {"name": "C", "height": hC}
    else:
        temp_mid = {"name": "C", "height": hC}

    print(temp_max["name"])
    print(temp_mid["name"])
    print(temp_min["name"])


if __name__ == "__main__":
    main()
