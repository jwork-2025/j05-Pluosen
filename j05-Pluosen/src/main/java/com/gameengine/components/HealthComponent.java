package com.gameengine.components;

import com.gameengine.core.Component;
import com.gameengine.core.GameObject;

public class HealthComponent extends Component<HealthComponent> {
    private int maxHealth;
    private int currentHealth;

    public HealthComponent(int maxHealth) {
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    @Override
    public void initialize() {
        // 初始化逻辑
    }

    @Override
    public void update(float deltaTime) {
        // 每帧更新血量逻辑，如果需要
    }

    @Override
    public void render() {
        // 血量组件不直接渲染
    }

    // 扣血
    public void takeDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth < 0) currentHealth = 0;
    }

    // 加血
    public void heal(int amount) {
        currentHealth += amount;
        if (currentHealth > maxHealth) currentHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public boolean isDead() {
        return currentHealth <= 0;
    }
}
