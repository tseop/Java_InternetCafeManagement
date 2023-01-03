package com.seop.cafe.util;

import com.seop.cafe.domain.Item;

public class ItemValidator {

    private Item item;

    public ItemValidator() {
    }

    public void itemAddValidator(Item item) {
        this.item = item;
        nameValidate();
        categoryValidate();
        priceValidate();
        stockValidate();
    }

    private void nameValidate() {
        if (item.getName().length() == 0 || item.getName() == null) {
            throw new IllegalArgumentException("이름을 작성해 주세요.");
        }
    }

    private void categoryValidate() {
        if (item.getCategory() == null) {
            throw new IllegalArgumentException("카테고리가 없습니다.");
        }
    }

    private void priceValidate() {
        if (item.getPrice() < 0) {
            throw new IllegalArgumentException("가격은 0원 미만일 수 없습니다.");
        }
    }

    private void stockValidate() {
        if (item.getStock() < 0) {
            throw new IllegalArgumentException("수량은 0개 미만일 수 없습니다.");
        }
    }


}
