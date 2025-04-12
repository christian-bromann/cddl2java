/// <reference types="vitest" />
import { defineConfig } from 'vite'

export default defineConfig({
    test: {
        include: ['tests/**/*.test.ts'],
        coverage: {
            enabled: true,
            exclude: [
                'build/**',
                'dist/**',
                'node_modules/**',
                'bin/**',
                '*.ts'
            ],
            thresholds: {
                lines: 94,
                functions: 90,
                branches: 91,
                statements: 94
            }
        }
    }
})
